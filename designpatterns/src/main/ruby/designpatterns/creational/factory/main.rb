require_relative 'ConcreteCreator1'
require_relative 'ConcreteCreator2'

# The client code works with an instance of a concrete creator, albeit through
# its base interface. As long as the client keeps working with the creator via
# the base interface, you can pass it any creator's subclass.
def client_code(creator)
  print "Client: I'm not aware of the creator's class, but it still works.\n"\
        "#{creator.some_operation}"
end

puts 'App: Launched with the ConcreteCreator1.'
client_code(ConcreteCreator1.new)
puts "\n\n"

puts 'App: Launched with the ConcreteCreator2.'
client_code(ConcreteCreator2.new)
