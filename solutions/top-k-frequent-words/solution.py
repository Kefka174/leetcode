"""
:type words: List[str]
:type k: int
:rtype: List[str]
"""
def topKFrequent(words, k): # o(nk)
    returnList = []
    freqDict = {}
    for word in words: freqDict[word] = freqDict.get(word, 0) + 1 # could use Collections.Counter
    
    for i in range(k):
        mostFrequentKey = ""
        mostFrequentVal = 0
        for key in freqDict:
            if freqDict[key] > mostFrequentVal or (freqDict[key] == mostFrequentVal and key < mostFrequentKey):
                mostFrequentVal = freqDict[key]
                mostFrequentKey = key
        returnList.append(mostFrequentKey)
        freqDict.pop(mostFrequentKey)
        
    return returnList


assert topKFrequent(["i","love","leetcode","i","love","coding"], 2) == ["i", "love"]
assert topKFrequent(["the","day","is","sunny","the","the","the","sunny","is","is"], 4) == ["the","is","sunny","day"]