{- Write a function that accepts a list (lst) of integers as the parameter, and filters out a
sub-list (of lst) which contains only the 3’s multiples and 5’s multiples in lst (if any). As an example, if lst is
[10,2,12,35,15,32,20], then the output is [10,12,35,15,20]. Writing README carries 1 point.
-}

module Main where 
    multiples lst = (lst `mod` 3 == 0 || lst `mod` 5 == 0)
    main = print(filter multiples[ 10,2,12,35,15,32,20])
