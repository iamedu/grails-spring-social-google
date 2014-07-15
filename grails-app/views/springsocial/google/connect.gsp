<html>
<head>
    <title>Connect to Google</title>
    <meta name='layout' content='googleLayout'/>
</head>

<body>
<h1>Connect to Google</h1>


<g:form mapping="springSocialConnect" params="[providerId: 'google']" method="POST">
    <div class="formInfo">
        <p>
            You haven't created any connections with Google yet. Click the button to connect Spring Social Showcase with your Google account.
            (You'll be redirected to Google where you'll be asked to authorize the connection.)
        </p>
    </div>

    <g:hiddenField name="scope" value="https://www.googleapis.com/auth/plus.me" />

    <p><button type="submit">Connect with Google+</button></p>

</g:form>

</body>
</html>
