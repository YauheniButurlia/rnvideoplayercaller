#import <React/RCTBridgeModule.h>
#import <Foundation/Foundation.h>
#import <AVKit/AVKit.h>
#import <AVFoundation/AVFoundation.h>

@interface NativeVideoPlayerCaller : NSObject <RCTBridgeModule>

@property (strong, nonatomic) NSURL *videoURL;
@property (nonatomic, strong) AVPlayerViewController *playerViewController;

@end
