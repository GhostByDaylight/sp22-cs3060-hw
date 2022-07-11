toDigitList :: Int -> [Int]
toDigitList n = if (n < 0) then [] else if (n < 10) then [n] else if (n == 0) then [0] else toDigitList (n `div` 10) ++ [n `mod` 10] 
main = print(toDigitList 2579)

