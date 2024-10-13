
<body>
    <h1>TCP Sum Server</h1>
    
   <h2>Description</h2>
    <p>This project implements a simple TCP server in Java that receives two numbers from a client, calculates their sum, and returns the result back to the client. The server listens for incoming connections on port 8888.</p>
    
  <h2>Features</h2>
    <ul>
        <li>Accepts two numbers as input from a client.</li>
        <li>Computes the sum of the numbers.</li>
        <li>Sends the result back to the client over the same TCP connection.</li>
    </ul>

   <h2>Requirements</h2>
    <ul>
        <li>Java 8 or higher</li>
        <li>Basic understanding of TCP networking</li>
        <li>Socket programming knowledge in Java</li>
    </ul>

   <h2>Usage</h2>
    <ol>
        <li>Clone or download this repository.</li>
        <li>Compile the Java source code: <code>javac ServerTCP.java</code></li>
        <li>Run the server: <code>java ServerTCP</code></li>
        <li>Use any TCP client to send two numbers separated by a space.</li>
        <li>The server will return the sum of the two numbers.</li>
    </ol>
 <h2>Example</h2>
    <pre>
        Input: 5 10
        Output: Sum: 15
    </pre>

   <h2>Client-Side Example (HTML)</h2>
    <p>You can create a simple HTML form to send numbers to the server, or use a TCP client tool such as telnet or netcat.</p>

   <h2>Repository</h2>
    <p>Check out the code in the <a href="https://github.com/your-username/TCP-Sum-Server" target="_blank">TCP Sum Server GitHub repository</a>.</p>

  <h2>Author</h2>
    <p>Developed by Sifiso Vinjwa.</p>

</body>
</html>

