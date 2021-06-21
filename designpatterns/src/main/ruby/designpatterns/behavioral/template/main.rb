require_relative 'ConcreteClass1'
require_relative 'ConcreteClass2'

# The client code calls the template method to execute the algorithm. Client
# code does not have to know the concrete class of an object it works with, as
# long as it works with objects through the interface of their base class.
def client_code(abstract_class)
  # ...
  abstract_class.template_method
  # ...
end

puts 'Same client code can work with different subclasses:'
client_code(ConcreteClass1.new)
puts "\n"

puts 'Same client code can work with different subclasses:'
client_code(ConcreteClass2.new)