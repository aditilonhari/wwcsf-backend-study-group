require_relative 'AbstractProductAInterface'

class ConcreteProductA2
  include AbstractProductAInterface

  def useful_function_a
    'The result of the product A2.'
  end
end