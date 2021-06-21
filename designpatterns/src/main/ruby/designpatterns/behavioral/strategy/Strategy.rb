# The Strategy interface declares operations common to all supported versions of
# some algorithm.
#
# The Context uses this interface to call the algorithm defined by Concrete
# Strategies.
module Strategy
  # @abstract
  #
  # @param [Array] data
  def do_algorithm(_data)
    raise NotImplementedError, "#{self.class} has not implemented method '#{__method__}'"
  end
end