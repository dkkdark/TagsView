
Tags Custom View with variant gradient background


Examples:


<img width="254" alt="Снимок экрана 2023-01-31 в 11 04 26" src="https://user-images.githubusercontent.com/49618961/215703189-af4b61fc-56d6-458c-a888-c484fd04d4dc.png">


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
