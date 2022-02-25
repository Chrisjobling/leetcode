package easy.maxNumberOfWordsFoundInSentances

fun mostWordsFound(sentences: Array<String>): Int {
    var result = 0
    var length = 0
    sentences.forEach { x ->
        length = x.split(" ").size
        when {
            result < length -> {
                result = length
            }
        }
    }
    return result
}