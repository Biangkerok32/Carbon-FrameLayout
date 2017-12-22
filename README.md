[![](https://jitpack.io/v/luongvo/Carbon-FrameLayout.svg)](https://jitpack.io/#luongvo/Carbon-FrameLayout)

Carbon-FrameLayout
================
This is a forked version of [Carbon](https://github.com/ZieIony/Carbon) to provides to simple way 
to use `FrameLayout` like replacement of (CardView)[https://developer.android.com/reference/android/support/v7/widget/CardView.html] 
without other supported things.
 
For more information please take a look at original library [https://github.com/ZieIony/Carbon](https://github.com/ZieIony/Carbon)

## Why this?

On pre-Lollipop support's `CardView` doesn't cut its content to outline with rounded corners. There's 
nothing you can do with it. The implementation is broken and apparently performance is the reason.
If you really wish to have rounded corners on pre-Lollipop devices, use this fork. 

More about this issue: https://www.reddit.com/r/androiddev/comments/4bqsph/cardview_not_rounded_prelollipop/

## Samples

```xml
    <carbon.widget.FrameLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/carbon_grey_500"
        app:carbon_cornerRadius="8dp"
        app:carbon_elevation="@dimen/carbon_elevationCard">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">

            <ImageView
                android:id="@+id/image"
                android:layout_width="match_parent"
                android:layout_height="200dp"
                android:scaleType="centerCrop" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="48dp"
                android:gravity="center_vertical"
                android:paddingLeft="@dimen/carbon_padding"
                android:paddingRight="@dimen/carbon_padding"
                android:text="Card with rounded content" />

        </LinearLayout>

    </carbon.widget.FrameLayout>

```

![Rounded corners](https://github.com/luongvo/Carbon-FrameLayout/blob/master/images/roundedcorners.png)

## Installation

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency
```
	dependencies {
	        compile 'com.github.luongvo:Carbon-FrameLayout:[LATEST_VERSION]'
	}
```

### ProGuard

```
-keepclasseswithmembernames class * {
    native <methods>;
}

-keep class android.support.v8.renderscript.** { *; }
```

## License
```
Copyright 2015 Marcin Korniluk 'Zielony'

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
