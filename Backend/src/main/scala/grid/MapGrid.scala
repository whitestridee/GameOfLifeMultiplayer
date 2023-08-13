package grid

class MapGrid(
val height: Long,
val width: Long
             ) {
val grid: Array[Array[Long]] = Array.ofDim[Long](height, width)

}
