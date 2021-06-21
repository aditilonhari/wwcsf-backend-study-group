require_relative 'Strategy'

# Concrete Strategies implement the algorithm while following the base Strategy
# interface. The interface makes them interchangeable in the Context.

class ConcreteStrategyA
  include Strategy
  # @param [Array] data
  #
  # @return [Array]
  def do_algorithm(data)
    data.sort
  end
end