require_relative 'Context'
require_relative 'ConcreteStrategyA'
require_relative 'ConcreteStrategyB'

# The client code picks a concrete strategy and passes it to the context. The
# client should be aware of the differences between strategies in order to make
# the right choice.

context = Context.new(ConcreteStrategyA.new)
puts 'Client: Strategy is set to normal sorting.'
context.do_some_business_logic
puts "\n\n"

puts 'Client: Strategy is set to reverse sorting.'
context.strategy = ConcreteStrategyB.new
context.do_some_business_logic
