
Tags Custom View with variant gradient background


Examples:


<img width="270" alt="Снимок экрана 2023-01-31 в 11 42 23" src="https://user-images.githubusercontent.com/49618961/215711018-5e57f70c-917b-446f-bce4-051e6d13c643.png">


<img width="213" alt="Снимок экрана 2023-01-31 в 11 36 24" src="https://user-images.githubusercontent.com/49618961/215709847-478cb351-d9f8-4194-9b89-088e93803b0c.png">



```xml
<com.kseniabl.tagsview.TagView
    android:id="@+id/tagsView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:textColor="@color/black"
    app:firstGradientColor="@color/blue"
    app:secondGradientColor="@color/purple"/>
```


```kotlin
binding.tagsView.tags = arrayListOf(TagsModel("Apple"), TagsModel("Banana"), TagsModel("Pizza"), TagsModel("Pine"),
            TagsModel("Plum"), TagsModel("Orange"), TagsModel("Tomato"),
            TagsModel("Fish"), TagsModel("Spaghetti"), TagsModel("Soup"), TagsModel("Meat"))
```
