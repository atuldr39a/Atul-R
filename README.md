# Atul-R
QA Task -3 Automation Task Co-coin
# Project Details :
CoCoin is android application. CoCoin is an exhaustive personal finance and accounting app followed by a clean, beautiful UI. Co Coinis a money management app where you can add your expenses in a dedicated category and track your spendings. You can review your
expenses in detailed charts.

# Appium


Appium is an open source, cross-platform test automation tool for native,
hybrid and mobile web and desktop apps. We support simulators (iOS), emulators
(Android), and real devices (iOS, Android, Windows, Mac).

Want to skip straight to the action? Check out our [getting
started] (https://appium.readthedocs.io/en/stable/en/writing-running-appium/running-tests/)
### Supported Platforms

Appium supports app automation across a variety of platforms, like iOS,
Android, and Windows. Each platform is supported by one or more "drivers",
which know how to automate that particular platform. Choose a driver below for
specific information about how that driver works and how to set it up:

* iOS
    * The [XCUITest Driver](/docs/en/drivers/ios-xcuitest.md)
    * (DEPRECATED) The [UIAutomation Driver](/docs/en/drivers/ios-uiautomation.md)
* Android
    * (BETA) The [Espresso Driver](/docs/en/drivers/android-espresso.md)
    * The [UiAutomator2 Driver](/docs/en/drivers/android-uiautomator2.md)
    * (DEPRECATED) The [UiAutomator Driver](/docs/en/drivers/android-uiautomator.md)
    * (DEPRECATED) The [Selendroid Driver](/docs/en/drivers/android-selendroid.md)
* The [Windows Driver](/docs/en/drivers/windows.md) (for Windows Desktop apps)
* The [Mac Driver](/docs/en/drivers/mac.md) (for Mac Desktop apps)

### Why Appium?

1. You don't have to recompile your app or modify it in any way, due
   to use of standard automation APIs on all platforms.
2. You can write tests with your favorite dev tools using any
   [WebDriver](https://w3c.github.io/webdriver/webdriver-spec.html)-compatible
   language such as Java, Objective-C, JavaScript (Node), PHP, Python, Ruby,
   C#, Clojure, or Perl with the Selenium WebDriver API and [language-specific
   client libraries](/docs/en/about-appium/appium-clients.md).
3. You can use any testing framework.
4. Appium has built-in mobile web and hybrid app support. Within the same
   script you can switch seamlessly between native app automation and webview
   automation, all using the WebDriver model that's already the standard for
   web automation.

Investing in the
[WebDriver](https://w3c.github.io/webdriver/webdriver-spec.html) protocol means
you are betting on a single, free and open protocol for testing that has become
a web standard. Don't lock yourself into a proprietary stack.

For example, if you use Apple's XCUITest library without Appium you can only
write tests using Obj-C/Swift, and you can only run tests through Xcode.
Similarly, with Google's UiAutomator or Espresso you can only write tests in
Java. Appium opens up the possibility of true cross-platform native app
automation, for mobile and beyond. Finally!

If you're new to Appium, or want a fuller description of what this is all
about, please visit [Appium Introduction] (http://appium.io/introduction.html)

### Requirements

Your environment needs to be set up for the particular platforms that you want
to run tests on. Each of the drivers above documents the requirements for their
particular brand of automation. At a minimum, you will need to be able to run
Node.js 6+.

### Get Started

Check out our [Getting Started](/docs/en/about-appium/getting-started.md) guide
to get going with Appium.

There is also a repository that contains [many examples of tests in a variety
of different languages](https://github.com/appium/sample-code)!

### Setting up

Basically you need to have appium installed along with appium-doctor. I won't go into a walkthrough of setting these up as there are plenty resources out there to guide you in setting up Appium to test apps on both platforms. See below for a some helpful links to help you get appium and appium-doctor installed.

### http://appium.io/.
### http://appium.io/slate/en/tutorial/android.html.
### http://appium.io/slate/en/tutorial/ios.html.
### https://github.com/appium/appium-doctor.
### http://appium.io/slate/en/master/?java#.
At this point everything for Appium should be installed and in that process you should've installed Apache Maven. If not take a second to install Maven.

Here's a helpful link for doing that:

https://maven.apache.org/install.html

Running the tests

To run your tests simply you need to execute the following command from inside the project directory.

mvn test

### Android Configurations

To execute the examples over the Android platform you'll need:

### Android SDK
### Updated Build Tools, Platform Tools and, at least, one System Image (Android Version)
### Configure Android Path on your environment variables
### ANDROID_HOME: root android sdk directory
### PATH: ANDROID_HOME + the following paths = platform-tools, tools, tools/bin
### And Android Virtual Device
### AVD or Genymotion
### Inspect elements on Android

You can use the uiautomatorviewer to inspect elements on Android devices. or you can use Appium Desktop


### Running the sample tests
 To run the sample tests you first need to set the following enviroment variables "ios_app_path" and "android_app_path" on your system. These need to be defined globally to be the path to the iOS .app file and Android .apk file respectively. For help setting environment variables on your system check out the following links. 
 
https://www.howtogeek.com/51807/how-to-create-and-use-global-system-environment-variables/ (Even though it's an outdated version of Windows in the Screenshots, the process is the same)
https://www.cyberciti.biz/faq/set-environment-variable-unix/ (Unix and Linux Environments)
and the execute the following command from inside the project directory.

mvn test

### Documentation

For prettily-rendered docs, please visit [appium.io](http://appium.io). You can
always find the full list of Appium doc pages at [Appium's GitHub
Repo](https://github.com/appium/appium/tree/master/docs/en/) as well.

### Contributing

Please take a look at our [contribution documentation](CONTRIBUTING.md)
for instructions on how to build, test and run Appium from source.

### Roadmap

Interested in where Appium is heading in the future? Check out the [Roadmap](ROADMAP.md)

### Project History, Credits & Inspiration

* [History](http://appium.io/history)
* [Credits](/docs/en/contributing-to-appium/credits.md)

### User Forums

Announcements and debates often take place on the [Discussion
Group](https://discuss.appium.io), be sure to sign up!

### Troubleshooting

We put together a [troubleshooting
guide](/docs/en/writing-running-appium/troubleshooting.md).  Please have a look
here first if you run into any problems. It contains instructions for checking
a lot of common errors and how to get in touch with the community if you're
stumped.

### License

** All Rights Reserved**
