package com.example.users.ui.theme

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.users.domain.module.User
import com.example.users.widgets.UserWidget

@Composable
fun SuccessWidget(list: List<User>) {
    LazyColumn {
        items(list) { item ->
            UserWidget(
                userIcon = com.example.users.R.drawable.ic_launcher_background,
                name = item.name, email = item.email, status = item.status, gender = item.gender
            )
        }
    }
}

@Preview
@Composable
fun SuccessWidgetPreview(){
    val list = mutableListOf<User>()
    repeat(5){
        list.add(User(id = 0, name = "Rajan","rajan@gmail.com","male","active"))
    }
    SuccessWidget(list = list)
}