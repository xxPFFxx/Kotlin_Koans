fun containsEven(collection: Collection<Int>): Boolean =
        collection.any { x -> x%2 == 0 }
