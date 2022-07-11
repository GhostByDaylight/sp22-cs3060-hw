
captital = /[A-Z]/
counter = 0
p ARGV[0]

f = File.open("#{ARGV[0]}", "r")

f.each {|line|
	counter += 1 
	if line =~ captital
		p "line #{counter} #{line}"
		p "this line contains a word with a captital letter"
	end
}