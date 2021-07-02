require_relative 'ProductInterface'

class ConcreteProduct2
  include ProductInterface
  
  # @return [String]
  def operation
    '{Result of the ConcreteProduct2}'
  end
end