Provide text (transcript) to service and get back a map of words to number of times used. 

Create a POST call that takes in a block of text to sort threw.

Use a hashmap for tracking each word and how many times used.
If word already exists in hashmap go to next. 
        
    
    controller class
        POST endpoint (call)
            call service 
            returns service after transcribe service class is complete
            
            
    trancribe service class
        takes string (text) breaks into hashmap and counts 
        returns hashmap to controller class
      
      
      controller: recive request
      models: (JSON) 
        {
            "text": "sdnfuiv fsjvbui rtgnerkjga"
        }  