data Suit = Spades | Hearts deriving (Show)
data Rank = Ten | Jack | Queen | King | Ace deriving (Show) 
type Card = (Rank, Suit)
type Hand = [Card] 

value :: Rank -> Integer 
value Ten = 1
value Jack = 2
value Queen = 3 
value King = 4 
value Ace = 5
 
cardValue :: Card -> Integer 
cardValue (rank, suit) = value rank

higherCard :: Card -> Card -> Card
higherCard card1 card2 = if (cardValue card1) > (cardValue card2) then card1 else card2

productValue :: Hand -> Integer
productValue x = foldl (*) 1 (map(\t -> cardValue t) x)

higherHand :: Hand -> Hand -> Hand
higherHand hand1 hand2 = if (productValue hand1) > (productValue hand2) then hand1 else hand2

main = do
	print(cardValue (Jack, Hearts))
	print(higherCard (Jack, Hearts) (Ace, Spades))
	print(productValue [(Jack, Hearts),(Ace, Spades),(Queen, Hearts),(Jack,Spades)])
	print(higherHand [(Jack, Hearts),(Ace, Spades),(Queen, Hearts),(Jack,Spades)] [(Jack, Spades),(King, Spades),(Queen, Hearts),(Jack,Spades)])
