# JustEatApiTest

#Technical questions </br>
<b>1.	How long did you spend on the coding test? What would you add to your solution if you had more time? If you didn't spend much time on the coding test then use this as an opportunity to explain what you would add.</b></br>
Ans: </br?
1.1	Total time spend on the app: 3 hours</br>
1.2	To the existing solution, I have liked to introduce Uncle Bob’s 3-tier architecture where the app is divided into presentation, dataand domain layer. Include more material design features for UI/UX. Include more test cases.</br>
1.3 If I had more time, I would like to include certain extra features in the application like:</br>
a. Load a Google Map v3 with custom markers, which show nearest restaurants around the users location or a postcode entered manually</br>
b. Provide a navigation features on selection of a restaurant on Map</br>
c. Include material design features</br>
d. Introduce a push notification service using GCM service</br>

<b>2.	What was the most useful feature that was added to the latest version of your chosen language? Please include a snippet of code that shows how you've used it.</b></br>
Ans: The most useful feature added was Dagger 2 dependency injection and Reactive Programming. Use of Dagger2 improves flexibility in local integration tests and UI tests. Components can be replaced by doubles very easily and test different scenarios. Reactive programming helps in asynchronous processing and concurrency. </br>
  <i>  
/**
     * The method is used to refine the incoming stream and convert to a stream of Restaurant list.
     * @param justEatObservable
     * @return
     */</br>
    @Override</br>
    public Observable getJustEatRestaurants(Observable justEatObservable) {</br>
        justEatObservable = justEatObservable.map(new Func1<JustEat, List<Restaurant>>() {</br>
            @Override</br>
            public List<Restaurant> call(JustEat justEat) {</br>
                return justEat.getRestaurants();</br>
            }</br>
        });</br>
        return justEatObservable;</br>
    }</i>  </br>

<b>How would you track down a performance issue in production? Have you ever had to do this?</b></br>
1. Detecting Overdraw</br>
 One of the most common causes of a laggy, unresponsive user interface is overdraw. Overdraw is where you waste GPU processing time by coloring in pixels that only get colored in again by something else.</br>
2. Hierarchy Viewer: Simplify UI design</br>
3. Per-Node Profiling: Identify bottlenecks in your user interface is by gathering data about how long it takes each of your views to complete the measure, layout, and draw phases of the rendering process.</br>
4. Memory Leaks:</br>
 4.1 Leak Canary tool</br>
4.2 Memory Monitor is an easy way to get an overview of your app’s memory usage over time</br>
Android Device Monitor</br>
Another tool that can help you gather more information about memory leaks and other memory-related problems is the Android Device Monitor’s Heap tab.</br>
5 TraceView: Diagnose and address performance problems.</br>

<b>How would you improve the JUST EAT APIs that you just used?</b></br>
I would like the API to return the longitude and latitude of the restaurants, which will help to plot those on Google Maps </br>
3.	Please describe yourself using JSON.</br>
<?xml version="1.0" encoding="utf-8"?></br>
<personal_details></br>
<name>karma</name></br>
<profession>Smart Android Developer</profession></br>
<hobby>Play PS4</hobby></br>
<personality>adventurous</personality></br>
</personal_details></br>


