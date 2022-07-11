module Main where
	numPerfectSquares :: [Int] -> Int
	numPerfectSquares lst = length $ filter (isSquare) lst where
		isSquare :: Int -> Bool
		isSquare num = m - fromIntegral(truncate m) == 0.0 where m = sqrt(fromIntegral num)::Float


 	main = do 
		print(numPerfectSquares [42,9,70,16,225,15,300])
		print(numPerfectSquares [0])
		print(numPerfectSquares [4,9,16,81,225,4000,121,112,84])
