require_relative 'Strategy'

# Concrete Strategies implement the algorithm while following the base Strategy
# interface. The interface makes them interchangeable in the Context.

class ConcreteStrategyB
  include Strategy
  # @param [Array] data
  #
  # @return [Array]
  def do_algorithm(data)
    data.sort.reverse
  end
end