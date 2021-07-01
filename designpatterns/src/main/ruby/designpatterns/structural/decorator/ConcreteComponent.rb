require_relative 'ComponentInterface'

# Concrete Components provide default implementations of the operations. There
# might be several variations of these classes.
class ConcreteComponent
  include ComponentInterface
  # @return [String]
  def operation
    'ConcreteComponent'
  end
end
