fun main(){
    var dirtyLevel = 20
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))
    println(updateDirty(15, ::increaseDirty))
}

fun updateDirty (dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun increaseDirty( start: Int ) = start + 1

