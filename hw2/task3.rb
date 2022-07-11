require 'benchmark'


def function3A(num)
	num1 = 0
	num2 = 1
	for i in 0..num
		tempNum3 = num1
		num1 = num2
		num2 += tempNum3
		return tempNum3
	end	
	
end

def function3B(num)
	if num < 2
		return num
	else 
		return (function3B(num-1) + function3B(num-2))
	end		
end

Benchmark.bm(10) do |b|
	b.report("Iteration") {function3A(38)}

	b.report("Recursive") {
		for i in 0..38
			function3B(i)
		end
	}
end
