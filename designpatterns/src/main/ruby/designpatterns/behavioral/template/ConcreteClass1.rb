require_relative 'AbstractClass'

# Concrete classes have to implement all abstract operations of the base class.
# They can also override some operations with a default implementation.
class ConcreteClass1 < AbstractClass
  def required_operations1
    puts 'ConcreteClass1 says: Implemented Operation1'
  end

  def required_operations2
    puts 'ConcreteClass1 says: Implemented Operation2'
  end
end