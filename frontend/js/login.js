document.getElementById(\"loginBn\").onclick = async function() { 
    let u = document.getElementById('username').value;
    let p = document.getElementById('password').value;
    let r = await fetch('/auth/login', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({username: u, password: p})
    });
    let data = await r.json();
    if(data.success) {
        window.localStorage.setItem(\"user\", u);
        window.localStorage.setItem(\"role\", data.role);
        // redirect based on role
        if(data.role === \"employee\") window.location.href = \"dashboard.html\";
        else if(data.role === \"manager\") window.location.href = \"leave-approval.html\";
        else window.location.href = \"dashboard.html\";
    } else {
        document.getElementById('loginMessage').textContent = data.error || \"Login failed\";
    }
};