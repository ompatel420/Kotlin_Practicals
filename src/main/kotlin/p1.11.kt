class Matrix(
    private val matrix: Array<IntArray>,
    private val noOfRow: Int,
    private val noOfCol: Int
) {

    // Addition
    operator fun plus(other: Matrix): Matrix {
        val result = Array(noOfRow) { IntArray(noOfCol) }

        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                result[i][j] = matrix[i][j] + other.matrix[i][j]
            }
        }

        return Matrix(result, noOfRow, noOfCol)
    }

    // Subtraction
    operator fun minus(other: Matrix): Matrix {
        val result = Array(noOfRow) { IntArray(noOfCol) }

        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                result[i][j] = matrix[i][j] - other.matrix[i][j]
            }
        }

        return Matrix(result, noOfRow, noOfCol)
    }

    // Multiplication
    operator fun times(other: Matrix): Matrix {
        val result = Array(noOfRow) { IntArray(other.noOfCol) }

        for (i in 0 until noOfRow) {
            for (j in 0 until other.noOfCol) {
                for (k in 0 until noOfCol) {
                    result[i][j] += matrix[i][k] * other.matrix[k][j]
                }
            }
        }

        return Matrix(result, noOfRow, other.noOfCol)
    }

    // Customized Output
    override fun toString(): String {
        var output = "(${noOfRow} x ${noOfCol} Matrix):\n"

        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                output += "${matrix[i][j]}\t"
            }
            output += "\n"
        }

        return output
    }
}

fun main() {

    val firstMatrix = Matrix(
        arrayOf(
            intArrayOf(3, -2, 5),
            intArrayOf(3, 0, 4)
        ),
        2,
        3
    )

    val secondMatrix = Matrix(
        arrayOf(
            intArrayOf(2, 3),
            intArrayOf(-9, 0),
            intArrayOf(0, 4)
        ),
        3,
        2
    )

    val secondMatrix1 = Matrix(
        arrayOf(
            intArrayOf(6, 3),
            intArrayOf(9, 0),
            intArrayOf(5, 4)
        ),
        3,
        2
    )

    println("*************** Addition ***************")
    print("Matrix:1 ")
    println(secondMatrix1)

    print("Matrix:2 ")
    println(secondMatrix)

    val addition = secondMatrix1 + secondMatrix
    println("Addition:")
    println(addition)

    println("*************** Subtraction ***************")
    print("Matrix:1 ")
    println(secondMatrix1)

    print("Matrix:2 ")
    println(secondMatrix)

    val subtraction = secondMatrix1 - secondMatrix
    println("Subtraction:")
    println(subtraction)

    println("*************** Multiplication ***************")
    print("Matrix:1 ")
    println(firstMatrix)

    print("Matrix:2 ")
    println(secondMatrix)

    val multiplication = firstMatrix * secondMatrix
    println("Multiplication:")
    println(multiplication)
}