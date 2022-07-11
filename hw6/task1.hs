{- Write a Haskell function bar which takes two integers x and y as input parameters and returns
the sum of all positive even integers (z)s’ cubes whereas z is bigger than x and smaller than y. You need
to use foldl to do the above computation. As an example, if x is 2 and y is 20, then bar will compute
(33 +4
3 +...+193
). Writing README carries 1 point -}

bar :: Int -> Int -> Int
bar x y = foldl (+) 0 mylist where mylist = map(\t -> t^3) firstList where firstList = filter isEven [x+1..y-1] where isEven num = even num && num > 0
    
{- Write a Haskell function charCount which takes a string word as input, and counts how many
letters (say c1) in word are vowels and how many letters (say c2) in word are consonants, and returns two
counts (c1, c2) as a single tuple. As an example, if word is "AbCdGie", then charCount returns (3,4). Writing
README carries 1 point -}
    
    
charCount :: String -> (Int, Int)
charCount s = (length $ filter isVowel s, length(s) - (length $ filter isVowel s)) where 
    isVowel :: Char -> Bool
    isVowel x = elem x "AaEeIiOoUu"


{-Write a Haskell function shrtStrCount which takes a list of strings as input, and counts how
many strings have length less than 4, and returns the count. As an example, if input list is ["abcd", "de",
"fghtestwsd"], then shrtStrCount returns 1. -}

shrtStrCount :: [String] -> Int
shrtStrCount num = length $ filter condition num where 
	condition :: String -> Bool
	condition x = (length(x) < 4)


        
main = do
    print (bar (-4) 20)
    print (charCount "AbCdGie")
    print (shrtStrCount	["abcd", "de", "fghtestwsd"])
    



