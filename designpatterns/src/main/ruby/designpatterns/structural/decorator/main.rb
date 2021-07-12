require_relative 'ConcreteComponent'
require_relative 'ConcreteDecoratorA'
require_relative 'ConcreteDecoratorB'


# The client code works with all objects using the Component interface. This way
# it can stay independent of the concrete classes of components it works with.
def client_code(component)
  # ...

  print "RESULT: #{component.operation}"

  # ...
end

# This way the client code can support both simple components...
simple = ConcreteComponent.new
puts 'Client: I\'ve got a simple component:'
client_code(simple)
puts "\n\n"

# ...as well as decorated ones.
#
# Note how decorators can wrap not only simple components but the other
# decorators as well.
decorator1 = ConcreteDecoratorA.new(simple)
decorator2 = ConcreteDecoratorB.new(decorator1)
puts 'Client: Now I\'ve got a decorated component:'
client_code(decorator2)