require_relative 'AbstractProductAInterface'

# Concrete Products are created by corresponding Concrete Factories.
class ConcreteProductA1 
  include AbstractProductAInterface

  def useful_function_a
    'The result of the product A1.'
  end
end