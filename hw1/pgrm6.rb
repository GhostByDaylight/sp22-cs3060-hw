
def func6(input)
puts "Output for #{input}"

f = File.open(input) 
words = []
text = f.read.split(/[^a-zA-Z]/)
freqs = Hash.new(0)
text.each { |word| 
    freqs[word] += 1 
    
}
freqs = freqs.sort_by {|x,y| y }
freqs.reverse!
freqs.each {|word, freq| 
    #puts word+' '+freq.to_s
}
p "The third most frequent word is #{freqs[3]}" 
p "and the total number of unique words is #{freqs.length}"
 
end





func6("storyA.txt")
p 
func6("storyB.txt")