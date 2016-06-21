# JustEatApiTest

Technical questions
1.	How long did you spend on the coding test? What would you add to your solution if you had more time? If you didn't spend much time on the coding test then use this as an opportunity to explain what you would add.
Ans: 
1.1	Total time spend on the app: 3 hours
1.2	To the existing solution, I have liked to introduce Uncle Bob’s 3-tier architecture where the app is divided into presentation, data and domain layer. Include more material design features for UI/UX. Include more test cases.
1.3 If I had more time, I would like to include certain extra features in the application like:
a. Load a Google Map v3 with custom markers, which show nearest restaurants around the users location or a postcode entered manually
b. Provide a navigation features on selection of a restaurant on Map
c. Include material design features
d. Introduce a push notification service using GCM service
2.	What was the most useful feature that was added to the latest version of your chosen language? Please include a snippet of code that shows how you've used it.
Ans: The most useful feature added was Dagger 2 dependency injection and Reactive Programming. Use of Dagger2 improves flexibility in local integration tests and UI tests. Components can be replaced by doubles very easily and test different scenarios. Reactive programming helps in asynchronous processing and concurrency. 
    
/**
     * The method is used to refine the incoming stream and convert to a stream of Restaurant list.
     * @param justEatObservable
     * @return
     */
    @Override
    public Observable getJustEatRestaurants(Observable justEatObservable) {
        justEatObservable = justEatObservable.map(new Func1<JustEat, List<Restaurant>>() {
            @Override
            public List<Restaurant> call(JustEat justEat) {
                return justEat.getRestaurants();
            }
        });
        return justEatObservable;
    }  

How would you track down a performance issue in production? Have you ever had to do this?
1. Detecting Overdraw
 One of the most common causes of a laggy, unresponsive user interface is overdraw. Overdraw is where you waste GPU processing time by coloring in pixels that only get colored in again by something else.
2. Hierarchy Viewer: Simplify UI design
3. Per-Node Profiling: Identify bottlenecks in your user interface is by gathering data about how long it takes each of your views to complete the measure, layout, and draw phases of the rendering process.
4. Memory Leaks:
 4.1 Leak Canary tool
4.2 Memory Monitor is an easy way to get an overview of your app’s memory usage over time
Android Device Monitor
Another tool that can help you gather more information about memory leaks and other memory-related problems is the Android Device Monitor’s Heap tab.
5 TraceView: Diagnose and address performance problems.

How would you improve the JUST EAT APIs that you just used?
I would like the API to return the longitude and latitude of the restaurants, which will help to plot those on Google Maps 
3.	Please describe yourself using JSON.
<?xml version="1.0" encoding="utf-8"?>
<personal_details>
<name>karma</name>
<profession>Smart Android Developer</profession>
<hobby>Play PS4</hobby>
<personality>adventurous</personality>
</personal_details>


