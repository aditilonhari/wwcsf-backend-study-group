require_relative 'ObserverInterface'

# Concrete Observers react to the updates issued by the Publisher they had been attached to.

class ObserverB
  include ObserverInterface
  # @param [Publisher] publisher
  def update(publisher)
    return unless publisher.state.zero? || publisher.state >= 2

    puts 'ObserverB: Reacted to the event'
  end

  def to_s
    'ObserverB'
  end
end