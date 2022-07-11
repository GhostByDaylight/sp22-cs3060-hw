puts "Please pick a number between 15 and 30"
input = gets.to_i
result = []
random = Random.new
for i in 0..input-1 do
	#random = rand(0,1)
	rollCount = random.rand(0..1) 
	if rollCount == 0
		result[i] = "Heads"
	elsif rollCount == 1
		result[i] = "Tails"
	end
end

numHeads = 0
numTails = 0
result.each{|value|
	if value == "Heads"
		numHeads += 1
	elsif value == "Tails"
		numTails += 1
	end
}
p "The Ratio of Heads to Tails is #{numHeads} : #{numTails}"
