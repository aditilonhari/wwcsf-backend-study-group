require_relative 'ObserverInterface'

# Concrete Observers react to the updates issued by the Publisher they had been attached to.

class ObserverA
  include ObserverInterface
  # @param [Publisher] publisher
  def update(publisher)
    puts 'ObserverA: Reacted to the event' if publisher.state < 5
  end

  def to_s
    'ObserverA'
  end
end