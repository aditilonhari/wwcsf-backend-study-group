require_relative 'DecoratorInterface'

# Decorators can execute their behavior either before or after the call to a
# wrapped object.
class ConcreteDecoratorB
  include DecoratorInterface
  # @return [String]
  def operation
    "ConcreteDecoratorB(#{@component.operation})"
  end
end