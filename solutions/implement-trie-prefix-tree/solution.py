class Trie(object):
    # could instead use a dict of dicts for each letter
    def __init__(self):
        self._wordDict = {}
        self._prefixDict = {}

    """
    :type word: str
    :rtype: None
    """
    def insert(self, word):
        self._wordDict[word] = self._wordDict.get(word, 0) + 1
        for i in range(len(word)):
            self._prefixDict[word[0:i+1]] = self._prefixDict.get(word[0:i+1], 0) + 1

    """
    :type word: str
    :rtype: bool
    """
    def search(self, word):
        return word in self._wordDict

    """
    :type prefix: str
    :rtype: bool
    """
    def startsWith(self, prefix):
        return prefix in self._prefixDict


# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)