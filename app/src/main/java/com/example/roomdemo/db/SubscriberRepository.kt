package com.example.roomdemo.db

class SubscriberRepository (private val dao : SubscriberDAO)
{
    val  subscribers = dao.getAllSubscribers()

    suspend fun  insert(subsciber : Subscriber) : Long{
       return dao.insertSubscriber(subsciber)
    }

    suspend fun update(subsciber: Subscriber) : Int{
      return  dao.updateSubscriber(subsciber)
    }

    suspend fun  delete(subsciber: Subscriber) : Int{
        return  dao.deleteSubscriber(subsciber)
    }
    suspend fun deleteAll() : Int{
        return  dao.deleteAll()
    }
}