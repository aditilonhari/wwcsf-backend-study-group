require_relative 'Singleton'
require_relative 'SingletonNaive'

puts "The client code  using SingletonNaive implementation"
s1 = SingletonNaive.instance
s2 = SingletonNaive.instance
puts s1.to_s
puts s2.to_s

if s1.equal?(s2)  
  puts 'Singleton works, both variables contain the same instance.'
else
  puts 'Singleton failed, variables contain different instances.'
end

puts "\n\nThe client code  using threadsafe Singleton implementation"
# @param [String] value
def test_singleton(value)
  singleton = Singleton.instance(value)
  puts singleton.value
end

# The client code.

puts "If you see the same value, then singleton was reused (yay!)\n"\
     "If you see different values, then 2 singletons were created (booo!!)\n\n"\
     "RESULT:\n\n"

process1 = Thread.new { test_singleton('FOO') }
process2 = Thread.new { test_singleton('BAR') }
process1.join
process2.join
