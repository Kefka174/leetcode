from typing import List
from sortedcontainers import SortedList

class FoodRatings:
    def __init__(self, foods: List[str], cuisines: List[str], ratings: List[int]):
        self.foodRatings = {}
        self.foodCuisines = {}
        self.cuisinesSorted = {}
        for i in range(len(foods)):
            self.foodRatings[foods[i]] = ratings[i]
            self.foodCuisines[foods[i]] = cuisines[i]
            if cuisines[i] not in self.cuisinesSorted:
                self.cuisinesSorted[cuisines[i]] = SortedList([foods[i]], lambda food: (-self.foodRatings[food], food))
            else:
                self.cuisinesSorted[cuisines[i]].add(foods[i])

    def changeRating(self, food: str, newRating: int) -> None:
        self.cuisinesSorted[self.foodCuisines[food]].remove(food)
        self.foodRatings[food] = newRating
        self.cuisinesSorted[self.foodCuisines[food]].add(food)

    def highestRated(self, cuisine: str) -> str:
        return self.cuisinesSorted[cuisine][0]