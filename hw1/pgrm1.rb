#!/usr/bin/ruby



p "Please input 3 lines of text: "
f = File.open('myFile.txt', 'w')
line1 = gets.chomp
line2 = gets.chomp
line3 = gets.chomp

f.write line1
f.write line2
f.write line3

f.close



p "Thank you for your input"
f = File.open('myFile.txt', 'r')
totalChar = line1.length + line2.length + line3.length
f.each{|x| p totalChar}
f.close