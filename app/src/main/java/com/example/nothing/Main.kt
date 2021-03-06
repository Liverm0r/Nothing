package com.example.nothing

import com.livermor.delegateadapter.delegate.DelegateAdapter
import com.livermor.delegateadapter.delegate.KDelegateAdapter
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

fun main() = runBlocking {
    val context2: CoroutineContext = Job()
    val context3: CoroutineContext = Dispatchers.Main
    val scope = CoroutineScope(context2 + context3)
    val job: Job = scope.launch {
        val result = async {

        }.await()
    }
}
