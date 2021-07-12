class AlphabeticalOrderIterator
  # In Ruby, the Enumerable mixin provides classes with several traversal and
  # searching methods, and with the ability to sort. The class must provide a
  # method each, which yields successive members of the collection.
  include Enumerable

  # This attribute indicates the traversal direction.
  attr_accessor :reverse
  private :reverse

  # @return [Array]
  attr_accessor :collection
  private :collection

  # @param [Array] collection
  # @param [Boolean] reverse
  def initialize(collection, reverse = false)
    @collection = collection
    @reverse = reverse
  end

  def each(&block)
    return @collection.reverse.each(&block) if reverse

    @collection.each(&block)
  end
end