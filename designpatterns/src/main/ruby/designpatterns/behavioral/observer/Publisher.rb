require_relative 'PublisherInterface'

# The Publisher owns some important state and notifies observers when the state
# changes.
class Publisher
  include PublisherInterface
  # For the sake of simplicity, the Publisher's state, essential to all subscribers, is stored in this variable.
  attr_accessor :state

  # @!attribute observers
  # @return [Array<Observer>] attr_accessor :observers private :observers

  def initialize
    @observers = []
  end

  # List of subscribers. In real life, the list of subscribers can be stored more comprehensively (categorized by event type, etc.).

  # @param [Obserser] observer
  def attach(observer)
    puts "\nPublisher: Attached an observer - #{observer.to_s}"
    @observers << observer
  end

  # @param [Obserser] observer
  def detach(observer)
    puts "\nPublisher: Dettach observer - #{observer.to_s}"
    @observers.delete(observer)
  end

  # The subscription management methods.

  # Trigger an update in each subscriber.
  def notify
    puts 'Publisher: Notifying observers...'
    @observers.each { |observer| observer.update(self) }
  end

  # Usually, the subscription logic is only a fraction of what a Publisher can
  # really do. Publishers commonly hold some important business logic, that
  # triggers a notification method whenever something important is about to
  # happen (or after it).
  def some_business_logic
    puts "\nPublisher: I'm doing something important."
    @state = rand(0..10)

    puts "Publisher: My state has just changed to: #{@state}"
    notify
  end
end