# credit_spider
Customize the view credit score dial and a radar dial.
## Use
Write into the layout file
```
<com.rwq.plate.CreditCheckView
  android:id="@+id/ccv_credit"
  android:layout_width="match_parent"
  android:layout_height="match_parent" />
```
or
```
 <com.rwq.plate.SpiderChartView
    android:id="@+id/scv_spider"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```
Write into the activity file
```
((CreditCheckView) findViewById(R.id.ccv_credit)).setCurrentCreditValue(1400);
```
or
```
((SpiderChartView) findViewById(R.id.scv_spider)).setValues(new int[]{
                  70,
                  60,
                  41,
                  68,
                  90,
                  30}
         );
```
