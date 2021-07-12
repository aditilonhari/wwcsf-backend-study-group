require_relative 'Leaf'
require_relative 'Composite'

# The client code works with all of the components via the base interface.
def client_code(component)
  puts "RESULT: #{component.operation}"
end

# Thanks to the fact that the child-management operations are declared in the
# base Component class, the client code can work with any component, simple or
# complex, without depending on their concrete classes.
def client_code2(component1, component2)
  component1.add(component2) if component1.composite?

  print "RESULT: #{component1.operation}"
end

# This way the client code can support the simple leaf components...
simple = Leaf.new
puts 'Client: I\'ve got a simple component:'
client_code(simple)
puts "\n"

# ...as well as the complex composites.
tree = Composite.new

branch1 = Composite.new
branch1.add(Leaf.new)
branch1.add(Leaf.new)

branch2 = Composite.new
branch2.add(Leaf.new)

tree.add(branch1)
tree.add(branch2)

puts 'Client: Now I\'ve got a composite tree:'
client_code(tree)
puts "\n"

puts 'Client: I don\'t need to check the components classes even when managing the tree:'
client_code2(tree, simple)
