require_relative 'ProductInterface'

# Concrete Products provide various implementations of the Product interface.
class ConcreteProduct1
  include ProductInterface
  
  # @return [String]
  def operation
    '{Result of the ConcreteProduct1}'
  end
end
