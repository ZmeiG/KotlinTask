class ReplaceChar{

    fun simpleByStringApi(string: String?, ch: Char) : String {

        if(string == null || string.isBlank()) return ""

        var res = ""
        for (c in string) {
            if(c != ch) res = res.plus(c)
        }
        return res
    }

    fun recursively(string: String, ch: Char) : String{
        if(string.isBlank()) return ""

        return if(string.contains(ch)){
            string.substringBefore(ch) + recursively(string.substringAfter(ch), ch)
        } else {
            string
        }
    }

}