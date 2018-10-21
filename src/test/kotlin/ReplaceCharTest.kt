import org.junit.Assert.assertEquals
import org.junit.Test

class ReplaceCharTest {

    @Test
    fun simpleByStringApiClear() {
        val repChar = ReplaceChar()
        assertEquals("MustBeString", repChar.simpleByStringApi("MustBeString", 'W'))

    }

    @Test
    fun simpleByStringApi() {
        val repChar = ReplaceChar()
        assertEquals("MustBeString", repChar.simpleByStringApi("MustBeWString", 'W'))

    }

    @Test
    fun simpleMultiByStringApi() {
        val repChar = ReplaceChar()
        assertEquals("MustBeString", repChar.simpleByStringApi("MusWtBeWStringW", 'W'))

    }

    @Test
    fun simpleByStringApiNUll() {
        val repChar = ReplaceChar()
        assertEquals("", repChar.simpleByStringApi(null, 'W'))

    }

    @Test
    fun simpleByStringApiEmpty() {
        val repChar = ReplaceChar()
        assertEquals("", repChar.simpleByStringApi("", 'W'))

    }

    @Test
    fun simpleByStringApiNewLine() {
        val repChar = ReplaceChar()
        assertEquals("", repChar.simpleByStringApi("\n", 'W'))

    }
    @Test
    fun byRecursively() {
        val repChar = ReplaceChar()
        assertEquals("MustBeString", repChar.recursively("MustBeWString", 'W'))

    }

    @Test
    fun multiByRecursively() {
        val repChar = ReplaceChar()
        assertEquals("MustBeString", repChar.recursively("MWustBeWStringW", 'W'))

    }

    @Test
    fun byRecursivelyEmpty() {
        val repChar = ReplaceChar()
        assertEquals("", repChar.recursively("", 'W'))

    }

    @Test
    fun byRecursivelyNewLine() {
        val repChar = ReplaceChar()
        assertEquals("", repChar.recursively("\n", 'W'))

    }
}