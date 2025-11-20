<%-- 
    Document   : profile
    Created on : Nov 18, 2025, 2:34:35 PM
    Author     : SCSM11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Profile</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Times New Roman, serif;
        }

        body {
            background: linear-gradient(135deg, rgba(224, 224, 224, 0.8), rgba(245, 245, 245, 0.8)), url('https://media.licdn.com/dms/image/v2/C561BAQHbzvCvMx2RSg/company-background_10000/company-background_10000/0/1585194224721/faculty_of_computer_and_mathematical_sciences_uitm_cover?e=2147483647&v=beta&t=TDUEgRv1eVbuuB3lyxs8UfX6O1vbYJVz0lr__tJQ9xg') no-repeat center center fixed;
            background-size: cover;
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 20px;
            animation: fadeIn 1s ease-in;
        }

        @keyframes fadeIn {
            from { opacity: 0; }
            to { opacity: 1; }
        }

        .profile-card {
            background: rgba(255, 255, 255, 0.9);
            border-radius: 15px;
            box-shadow: 0 10px 30px rgba(0,0,0,0.2);
            overflow: hidden;
            width: 100%;
            max-width: 600px;
            position: relative;
            transform: translateY(20px);
            animation: slideUp 0.8s ease-out forwards;
        }

        @keyframes slideUp {
            to { transform: translateY(0); }
        }

        .profile-header {
            background: linear-gradient(45deg, #4a90e2, #357abd);
            color: white;
            padding: 30px 20px;
            text-align: center;
            position: relative;
        }

        .profile-header::before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            background: url('data:image/svg+xml,<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 100 100"><circle cx="50" cy="50" r="2" fill="rgba(255,255,255,0.1)"/></svg>') repeat;
            opacity: 0.3;
        }

        .profile-pic {
            width: 100px;
            height: 100px;
            border-radius: 50%;
            background: linear-gradient(45deg, #4a90e2, #357abd);
            margin: 0 auto 15px;
            display: flex;
            align-items: center;
            justify-content: center;
            font-size: 2rem;
            color: white;
            border: 4px solid white;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
        }

        .greeting {
            font-size: 1.5rem;
            margin-bottom: 8px;
            font-weight: bold;
            text-shadow: 1px 1px 3px rgba(0,0,0,0.3);
        }

        .welcome-text {
            opacity: 0.9;
            font-size: 1rem;
        }

        .profile-content {
            padding: 30px;
        }

        .info-section {
            margin-bottom: 25px;
        }

        .section-title {
            color: #333;
            font-size: 1.2rem;
            margin-bottom: 12px;
            padding-bottom: 8px;
            border-bottom: 2px solid #f0f0f0;
            display: flex;
            align-items: center;
            font-weight: bold;
        }

        .section-title i {
            margin-right: 8px;
            color: #4a90e2;
        }

        .info-grid {
            display: grid;
            grid-template-columns: 1fr 2fr;
            gap: 12px;
            margin-bottom: 8px;
        }

        .info-label {
            font-weight: bold;
            color: #555;
            font-size: 14px;
        }

        .info-value {
            color: #333;
            font-size: 14px;
        }

        .hobbies-container {
            display: flex;
            flex-wrap: wrap;
            gap: 8px;
            margin-top: 8px;
        }

        .hobby-tag {
            background: linear-gradient(45deg, #4a90e2, #357abd);
            color: white;
            padding: 4px 12px;
            border-radius: 15px;
            font-size: 0.85rem;
            font-weight: 500;
        }

        .about-me {
            background: #fafafa;
            padding: 15px;
            border-radius: 8px;
            border-left: 4px solid #4a90e2;
            margin-top: 8px;
            font-size: 14px;
            line-height: 1.5;
        }

        .back-btn {
            background: linear-gradient(45deg, #4a90e2, #357abd);
            color: white;
            border: none;
            padding: 12px 25px;
            border-radius: 8px;
            font-size: 14px;
            font-weight: bold;
            cursor: pointer;
            margin-top: 20px;
            transition: all 0.3s ease;
            box-shadow: 0 4px 15px rgba(74, 144, 226, 0.4);
            width: 100%;
        }

        .back-btn:hover {
            background: linear-gradient(45deg, #357abd, #2c5aa0);
            transform: translateY(-2px);
            box-shadow: 0 6px 20px rgba(74, 144, 226, 0.6);
        }

        .contact-info {
            display: flex;
            align-items: center;
            gap: 8px;
            margin-top: 3px;
        }

        .email-icon {
            color: #4a90e2;
            font-weight: bold;
        }

        @media (max-width: 600px) {
            body {
                padding: 10px;
            }
            
            .profile-content {
                padding: 20px;
            }
            
            .profile-header {
                padding: 25px 15px;
            }
            
            .greeting {
                font-size: 1.3rem;
            }
            
            .profile-pic {
                width: 80px;
                height: 80px;
                font-size: 1.5rem;
            }
            
            .info-grid {
                grid-template-columns: 1fr;
                gap: 8px;
            }
        }
    </style>
</head>
<body>
    <div class="profile-card">
        <div class="profile-header">
            <div class="profile-pic">
                <%= request.getAttribute("name").toString().charAt(0) %>
            </div>
            <h1 class="greeting">Hello, <%= request.getAttribute("name") %>!</h1>
            <p class="welcome-text">Nice to meet you!</p>
        </div>
        
        <div class="profile-content">
            <div class="info-section">
                <h2 class="section-title">Personal Information</h2>
                <div class="info-grid">
                    <div class="info-label">Name:</div>
                    <div class="info-value"><%= request.getAttribute("name") %></div>
                    
                    <div class="info-label">Student ID:</div>
                    <div class="info-value"><%= request.getAttribute("studentId") %></div>
                    
                    <div class="info-label">Program:</div>
                    <div class="info-value"><%= request.getAttribute("program") %></div>
                    
                    <div class="info-label">Email:</div>
                    <div class="info-value">
                        <div class="contact-info">
                            <%= request.getAttribute("email") %>
                        </div>
                    </div>
                </div>
            </div>

            <div class="info-section">
                <h2 class="section-title">Hobbies</h2>
                <div class="hobbies-container">
                    <%
                        String hobbies = (String) request.getAttribute("hobbies");
                        if (hobbies != null && !hobbies.isEmpty()) {
                            String[] hobbiesArray = hobbies.split(",");
                            for (String hobby : hobbiesArray) {
                                String trimmedHobby = hobby.trim();
                                if (!trimmedHobby.isEmpty()) {
                    %>
                    <div class="hobby-tag"><%= trimmedHobby %></div>
                    <%
                                }
                            }
                        }
                    %>
                </div>
            </div>

            <div class="info-section">
                <h2 class="section-title">About Me</h2>
                <div class="about-me">
                    <%= request.getAttribute("introduction") %>
                </div>
            </div>

            <button class="back-btn" onclick="window.location.href='index.html'">
                ← Create Another Profile
            </button>
        </div>
    </div>
</body>
</html>